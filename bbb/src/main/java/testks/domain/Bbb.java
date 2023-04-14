package testks.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import testks.BbbApplication;

@Entity
@Table(name = "Bbb_table")
@Data
public class Bbb {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static BbbRepository repository() {
        BbbRepository bbbRepository = BbbApplication.applicationContext.getBean(
            BbbRepository.class
        );
        return bbbRepository;
    }
}
