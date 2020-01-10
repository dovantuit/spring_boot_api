//package com.example.postgresdemo.controller;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.postgresdemo.exception.ResourceNotFoundException;
//import com.example.postgresdemo.model.Profile;
//import com.example.postgresdemo.repository.ProfileRepository;
//import com.example.postgresdemo.repository.UserRepository;
//
//@RestController
//public class ProfileController {
//
//    @Autowired
//    private ProfileRepository profileRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @GetMapping("/users/{userId}/profiles")
//    public List<Profile> getProfilesByUserId(@PathVariable Long userId) {
//        return profileRepository.findByUserId(userId);
//    }
//
//    @PostMapping("/users/{userId}/profiles")
//    public Profile addProfile(@PathVariable Long userId,
//                            @Valid @RequestBody Profile profile) {
//        return userRepository.findById(userId)
//                .map(user -> {
//                    profile.setUser(user);
//                    return profileRepository.save(profile);
//                }).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + userId));
//    }
//
//    @PutMapping("/users/{userId}/profile/{profileId}")
//    public Profile updateProfile(@PathVariable Long userId,
//                               @PathVariable Long profileId,
//                               @Valid @RequestBody Profile profileRequest) {
//        if(!userRepository.existsById(userId)) {
//            throw new ResourceNotFoundException("User not found with id " + userId);
//        }
//
//        return profileRepository.findById(profileId)
//                .map(profile -> {
//                    profile.setText(profileRequest.getText());
//                    return profileRepository.save(profile);
//                }).orElseThrow(() -> new ResourceNotFoundException("Profile not found with id " + profileId));
//    }
//
//    @DeleteMapping("/users/{userId}/profiles/{profileId}")
//    public ResponseEntity<?> deleteProfile(@PathVariable Long userId,
//                                          @PathVariable Long profileId) {
//        if(!userRepository.existsById(userId)) {
//            throw new ResourceNotFoundException("User not found with id " + userId);
//        }
//
//        return profileRepository.findById(profileId)
//                .map(profile -> {
//                    profileRepository.delete(profile);
//                    return ResponseEntity.ok().build();
//                }).orElseThrow(() -> new ResourceNotFoundException("Profile not found with id " + profileId));
//
//    }
//}
