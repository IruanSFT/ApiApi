package solinfteccom.example.springstock.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "stocks")
public class Stocks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("market_cap")
    private Double marketCap;

    @JsonProperty("stock_symbol")
    private String stockSymbol;

    @JsonProperty("stock_name")
    private String stockName;

    @JsonProperty("ask_min")
    private Double askMin;

    @JsonProperty("ask_max")
    private Double askMax;

    @JsonProperty("bid_min")
    private Double bidMin;

    @JsonProperty("bid_max")
    private Double bidMax;

    @CreationTimestamp
    @JsonProperty("created_on")
    private Timestamp createdOn;

    @JsonProperty("updated_on")
    @UpdateTimestamp
    private Timestamp updatedOn;


    public Stocks() {
        this.createdOn = Timestamp.valueOf(LocalDateTime.now());
        this.updatedOn = Timestamp.valueOf(LocalDateTime.now());
    }
    
}