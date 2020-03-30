package com.itwill.staily.mypage.service;

import java.util.List;

import com.itwill.staily.mypage.model.dto.Friend;

public interface FriendService {
	//친구 1명 출력(Pk로)
	//회원의 친구 리스트 출력(m_no로)
	//친구 추가
	//친구 삭제(Pk로)
	
	public List<Friend> selectList(int mNo) throws Exception;
	
	public boolean createFriend(Friend friend) throws Exception;
	
	public boolean deleteFriend(int fNo) throws Exception;
}