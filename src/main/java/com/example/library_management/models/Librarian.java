package com.example.library_management.models;

import java.util.ArrayList;
import java.util.List;

public class Librarian extends User{

    private List<Member> members;

    public Librarian() {
        this.members = new ArrayList<>();
    }

    public List<Member> getMembers() {
        return members;
    }

    public void registerMember(Member member) {
        if (member != null && !members.contains(member)) {
            members.add(member);
            System.out.println("Member registered successfully.");
        } else {
            System.out.println("Member already exists or invalid member.");
        }
    }
    public void deleteMember(Member member) {
        if (members.contains(member)) {
            members.remove(member);
            System.out.println("Member removed successfully.");
        } else {
            System.out.println("Member not found.");
        }
    }
}
