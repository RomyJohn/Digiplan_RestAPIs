package com.digiplan.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digiplan.entities.Draft;
import com.digiplan.repositories.DraftRepository;
import com.digiplan.services.DraftService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DraftServiceImpl implements DraftService {

	@Autowired
	private DraftRepository draftRepository;

	@Override
	public Draft getDraft(Integer id) {
		log.info("@Start getDraft");
		Draft draft = null;
		try {
			draft = draftRepository.getById(id);
		} catch (Exception exception) {
			log.error("Exception = " + exception);
		}
		return draft;
	}

	@Override
	public List<Draft> getAllDrafts() {
		log.info("@Start getAllDrafts");
		List<Draft> draftsList = null;
		try {
			draftsList = draftRepository.findAll();
		} catch (Exception exception) {
			log.error("Exception = " + exception);
		}
		return draftsList;
	}

	@Override
	public Draft addDraft(Draft draftData) {
		log.info("@Start addDraft");
		Draft draft = null;
		try {
			draft = draftRepository.saveAndFlush(draftData);
		} catch (Exception exception) {
			log.error("Exception = " + exception);
		}
		return draft;
	}

	@Override
	public Draft updateDraft(Integer id, Draft draftData) {
		log.info("@Start updateDraft");
		Draft draft = null;
		try {
			Optional<Draft> check = draftRepository.findById(id);
			if (check.isPresent())
				draft = draftRepository.saveAndFlush(draftData);
		} catch (Exception exception) {
			log.error("Exception = " + exception);
		}
		return draft;
	}

	@Override
	public String deleteDraft(Integer id) {
		log.info("@Start deleteDraft");
		String status = "";
		try {
			draftRepository.deleteById(id);
			status = "Deleted";
		} catch (Exception exception) {
			log.error("Exception = " + exception);
		}
		return status;
	}

}
