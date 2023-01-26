package com.tbz.q3.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class FriendshipsTest {
	
	//have the necessary attributes listed:
	Friendships friendships;
	

	@BeforeEach
	void setUp() throws Exception {
		// set up the objects with dummy data
		friendships = new Friendships();
		friendships.makeFriends("Joe", "Audrey");
		friendships.makeFriends("Joe", "Peter");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		//this method is executed after testing
		//useful to close external resources if necessary
	}

	
	@Test
	void testGetFriendsList() {
		assertEquals(2, friendships.getFriendsList("Joe").size(), 0);
		
	}
	
	@Test
	void testAreFriends() {
		assertTrue(friendships.areFriends("Joe", "Audrey"));
	}

}
