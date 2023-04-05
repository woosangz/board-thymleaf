package idusw.springboot.boardthymleaf.repository;

import idusw.springboot.boardthymleaf.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
