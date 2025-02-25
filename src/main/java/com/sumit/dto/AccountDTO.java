package com.sumit.dto;

import com.sumit.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    private String accountType;

    private String branchAddress;

    private Customer customer;

}