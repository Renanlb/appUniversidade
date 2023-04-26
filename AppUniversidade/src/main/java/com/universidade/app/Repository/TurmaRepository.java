package com.universidade.app.Repository;

import com.universidade.app.Model.TurmaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository <TurmaModel, Long> {

}
