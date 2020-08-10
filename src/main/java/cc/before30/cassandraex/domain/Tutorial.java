package cc.before30.cassandraex.domain;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

/**
 * Tutorial
 *
 * @author before30
 * @since 2020/08/10
 */
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Tutorial {

    @PrimaryKey
    private UUID id;

    private String title;
    private String description;
    private boolean published;
}
