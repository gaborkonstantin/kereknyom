package com.spring.kereknyom.service;

import com.spring.kereknyom.domain.Blog;
import com.spring.kereknyom.domain.User;
import com.spring.kereknyom.dto.incoming.UserCreateUpdateCommand;
import com.spring.kereknyom.dto.outgoing.UserInfo;
import com.spring.kereknyom.repository.UserRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final BlogService blogService;

    public UserService(ModelMapper modelMapper, UserRepository userRepository, BlogService blogService) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.blogService = blogService;
    }


    public UserInfo save(@Valid UserCreateUpdateCommand command) {
        User user = modelMapper.map(command, User.class);
        Blog blogForUser = blogService.findById(command.getBlogId());
        user.setBlog(blogForUser);
        userRepository.save(user);
        return modelMapper.map(user, UserInfo.class);
    }


}
