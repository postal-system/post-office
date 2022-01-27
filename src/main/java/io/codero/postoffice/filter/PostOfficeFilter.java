package io.codero.postoffice.filter;

import io.codero.postoffice.dto.FilterPostOfficeDto;
import io.codero.postoffice.entity.PostOffice;
import io.codero.postoffice.entity.PostOffice_;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class PostOfficeFilter implements Specification<PostOffice> {
    private final FilterPostOfficeDto dto;


    @Override
    public Predicate toPredicate(Root<PostOffice> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();

        Optional.ofNullable(dto.getId()).ifPresent(action ->
                predicates.add(criteriaBuilder.equal(root.get(PostOffice_.id), dto.getId())));

        Optional.ofNullable(dto.getPartOfName()).ifPresent(action ->
                predicates.add(criteriaBuilder.like(root.get(PostOffice_.name), "%" + dto.getPartOfName() + "%")));

        Optional.ofNullable(dto.getPartOfAddress()).ifPresent(action ->
                predicates.add(criteriaBuilder.like(root.get(PostOffice_.address), "%" + dto.getPartOfAddress() + "%")));

        Optional.ofNullable(dto.getStartTime()).ifPresent(action ->
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get(PostOffice_.endTime), LocalTime.parse(dto.getStartTime())) ));

        Optional.ofNullable(dto.getEndTime()).ifPresent(action ->
                predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get(PostOffice_.startTime), LocalTime.parse(dto.getEndTime()))));

        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));

    }
}
