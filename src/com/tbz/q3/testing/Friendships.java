package com.tbz.q3.testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Friendships {
    private Map<String, List<String>> friends;

    public Friendships() {
        friends = new HashMap<String, List<String>>();
    }

    public void makeFriends(String person1, String person2) {
        if (!friends.containsKey(person1)) {
            friends.put(person1, new ArrayList<String>());
        }
        if (!friends.containsKey(person2)) {
            friends.put(person2, new ArrayList<String>());
        }
        friends.get(person1).add(person2);
        friends.get(person2).add(person1);
    }

    public List<String> getFriendsList(String person) {
        if (!friends.containsKey(person)) {
            return new ArrayList<String>();
        }
        return friends.get(person);
    }

    public boolean areFriends(String person1, String person2) {
        if (!friends.containsKey(person1) || !friends.containsKey(person2)) {
            return false;
        }
        return friends.get(person1).contains(person2);
    }
}
