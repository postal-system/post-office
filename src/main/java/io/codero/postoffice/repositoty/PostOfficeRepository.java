package io.codero.postoffice.repositoty;

import io.codero.postoffice.entity.PostOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PostOfficeRepository extends JpaRepository<PostOffice, Integer>, JpaSpecificationExecutor<PostOffice> {
}
