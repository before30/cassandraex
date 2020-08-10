package cc.before30.cassandraex.domain;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * TutorialRepository
 *
 * @author before30
 * @since 2020/08/10
 */
@Repository
public interface TutorialRepository extends CassandraRepository<Tutorial, UUID> {

    @AllowFiltering
    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);

}
