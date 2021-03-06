package pl.teamxd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.teamxd.model.entity.Event;

@Repository
public interface IEventRepository extends JpaRepository<Event, Long> {
}
