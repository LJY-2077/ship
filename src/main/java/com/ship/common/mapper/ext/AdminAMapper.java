package com.ship.common.mapper.ext;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.ship.domain.Admin;
@Mapper //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface AdminAMapper {
	Admin findByPro(Admin admin);
}