package com.josam.clink.account;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
	int registAccount(AccountVO vo);

}
