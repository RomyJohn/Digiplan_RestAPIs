package com.digiplan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digiplan.entities.Gallery;

public interface GalleryRepository extends JpaRepository<Gallery, String> {

}
