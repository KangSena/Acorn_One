package com.one.project.users.dao;

import com.one.project.users.dto.UsersDto;

public interface UsersDao {
	//인자로 전달된 아이디가 존재하는지 여부를 리턴하는 메소드.
	public boolean isExist(String inputId);
	//인자로 전달된 가입할 회원의 정보를 DB에 저장하는 메소드.
	public void insert(UsersDto dto);
	//인자로 전달하는 아이디에 해당하는 정보를 리턴하는 메소드.
	public UsersDto getData(String id);
	//개인정보를 수정하는 메소드.
	public void update(UsersDto dto);
	//비밀번호를 수정하는 메소드.
	public void updatePwd(UsersDto dto);
	//회원 정보를 삭제하는 메소드.
	public void delete(String id);
	
}
