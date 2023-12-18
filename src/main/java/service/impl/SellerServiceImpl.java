package service.impl;

import entity.Seller;
import org.springframework.stereotype.Service;
import service.SellerService;

import java.util.List;

@Service
public class SellerServiceImpl implements SellerService {
    @Override
    public List<Seller> getAllSellers() {
        return null;
    }

    @Override
    public Seller getSellerById(Long sellerId) {
        return null;
    }

    @Override
    public void saveSeller(Seller seller) {

    }

    @Override
    public void updateSeller(Long sellerId, Seller updatedSeller) {

    }

    @Override
    public void deleteSeller(Long sellerId) {

    }
}
