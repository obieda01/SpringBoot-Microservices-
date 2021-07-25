package com.obdev.user.VO;

import com.obdev.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTempleteVO {
    private User user;
    private Department department;
}
