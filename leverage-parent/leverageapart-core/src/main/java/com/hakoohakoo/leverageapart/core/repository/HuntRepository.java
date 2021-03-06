package com.hakoohakoo.leverageapart.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hakoohakoo.leverageapart.core.model.Hunt;


@Repository
public interface HuntRepository extends JpaRepository<Hunt, Integer>{
	List<Hunt> findByHuntDate(int huntDate);
	List<Hunt> findByHuntTypeId(int huntTypeId);
}
