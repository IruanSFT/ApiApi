package solinfteccom.example.springstock.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import solinfteccom.example.springstock.model.Stocks;
import solinfteccom.example.springstock.repository.StocksRepository;


@RestController
@RequestMapping("/stocks")
public class StocksController {

    @Autowired
    public StocksRepository stocksRepository;


    @GetMapping
    public List<Stocks> listStocks(){

        return stocksRepository.findAll();

    }
    
    
    @GetMapping("/{id}")
    public Optional<Stocks> listID(@PathVariable Long id, @RequestHeader("Authorization") String Token){

        return stocksRepository.findById(id);
    }
    
    // @PostMapping("/ask_bid")
    // public ResponseEntity<?> updateaskbid(@RequestBody  stocksDto){

    //     try {

    //         Stocks stocks = stocksRepository.findById(stocksDto.getId()).orElseThrow();

    //         if(stocksDto.getaskMax() != null && stocksDto.getaskMin() != null){

    //             stocks.setaskMax(stocksDto.getaskMax());
    //             stocks.setAskMin(stocksDto.getAskin());
    //         }
    //         if(stocksDto.getaskMax() != null && stocksDto.getaskMax() != null){

    //             stocks.setaskMax(stocksDto.getaskMax());
    //             stocks.setaskMax(stocksDto.getaskMax());
    //         }

    //         return new ResponseEntity(stocksRepository.save(stocks), HttpStatus.OK);
    //     } catch (Exception e) {

    //         return ResponseEntity.badRequest().build();
    //     }
    // }
}