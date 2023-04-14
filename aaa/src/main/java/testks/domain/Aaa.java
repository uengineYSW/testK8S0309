package testks.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import testks.AaaApplication;

@Entity
@Table(name = "Aaa_table")
@Data
public class Aaa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static AaaRepository repository() {
        AaaRepository aaaRepository = AaaApplication.applicationContext.getBean(
            AaaRepository.class
        );
        return aaaRepository;
    }
}
