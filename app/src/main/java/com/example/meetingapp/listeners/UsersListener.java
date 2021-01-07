package com.example.meetingapp.listeners;

import com.example.meetingapp.models.User;

public interface UsersListener {

    void initiateVideoMeeting(User user); // götüntülü video cağrısı online mı onu dinleyecek

    void initiateAudioMeeting(User user);


}
