package springboot.repository.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class OrderEntityJPO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    String orderNumber;
    String coffeeName;
    String coffeeCount;
    String customerName;
}
