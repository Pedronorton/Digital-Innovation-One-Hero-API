package com.digitialinnovationone.herosapi.repository;

import com.digitialinnovationone.herosapi.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;


@EnableScan
public interface HerosRepository extends CrudRepository<Heroes, String>{
}
