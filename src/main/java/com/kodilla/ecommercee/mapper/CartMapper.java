package com.kodilla.ecommercee.mapper;

import com.kodilla.ecommercee.controller.UserNotFoundException;
import com.kodilla.ecommercee.domain.Cart;
import com.kodilla.ecommercee.domain.CartDto;
import com.kodilla.ecommercee.repository.CartRepository;
import com.kodilla.ecommercee.repository.ProductRepository;
import com.kodilla.ecommercee.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartMapper {

    private final UserRepository userRepository;
    public Cart mapToCart(final CartDto cartDto) throws UserNotFoundException {
        return new Cart(cartDto.isActive(), userRepository.findById(cartDto.getUserId()).orElseThrow(UserNotFoundException::new));
    }
}
