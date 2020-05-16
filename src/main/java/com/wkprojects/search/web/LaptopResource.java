package com.wkprojects.search.web;

import com.wkprojects.search.model.SearchValueOperationModel;
import com.wkprojects.search.service.dto.LaptopDto;
import com.wkprojects.search.service.implementation.LaptopService;
import com.wkprojects.search.utils.PaginationUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/laptop")
@CrossOrigin(origins = {"http://localhost:4200", "https://laptop-store.netlify.app"}, exposedHeaders = "X-Total-Count")
public class LaptopResource {

    private final LaptopService laptopService;

    public LaptopResource(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @PostMapping("/add-random-laptops")
    public ResponseEntity addRandomLaptops(@RequestParam Integer number) {
        laptopService.addRandomLaptops(number);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/search")
    public ResponseEntity<List<LaptopDto>> getSearchedLaptops(@RequestBody Map<String, List<SearchValueOperationModel>> searchValue, Pageable pageable) {
        final Page<LaptopDto> page = laptopService.getSearchedLaptops(searchValue, pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }

    @GetMapping("/searchV2")
    public ResponseEntity<List<LaptopDto>> getSearchedLaptopsV2(@RequestParam Map<String, String> params, Pageable pageable) {
        final Page<LaptopDto> page = laptopService.getSearchedLaptopsV2(params, pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }
}
