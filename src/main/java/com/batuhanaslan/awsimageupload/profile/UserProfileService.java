package com.batuhanaslan.awsimageupload.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService {

    private final UserProfileDataAccess userProfileDataAccess;

    @Autowired
    public UserProfileService(UserProfileDataAccess userProfileDataAccess) {
        this.userProfileDataAccess = userProfileDataAccess;
    }

    List<UserProfile> getUserProfiles() {
        return userProfileDataAccess.getUserProfiles();
    }
}
