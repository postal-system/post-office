package io.codero.postoffice.repositoty;

import io.codero.postoffice.entity.PostOffice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostOfficeRepository extends JpaRepository<PostOffice, Integer> {
}
