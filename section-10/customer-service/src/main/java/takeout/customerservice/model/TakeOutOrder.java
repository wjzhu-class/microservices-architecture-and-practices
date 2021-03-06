package takeout.customerservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TakeOutOrder {
    private Long id;
    private String items;
    private String customer;
    private String waiter;
    private String chef;
    private Long price;
    private String state;
}
