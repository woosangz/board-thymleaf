package idusw.springboot.boardthymleaf.repository;

import idusw.springboot.boardthymleaf.entity.MemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoRepository extends JpaRepository<MemoEntity, Long> {
    // repository 는 data를 access 하는 객체, Entity (table, view, index....)
}
