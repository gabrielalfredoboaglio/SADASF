package service.impl;

import entity.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BrandRepository;
import service.BrandService;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    private final BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAllBrands() {
        return null;
    }

    @Override
    public Brand getBrandById(Long brandId) {
        return null;
    }

    @Override
    public void saveBrand(Brand brand) {

    }

    @Override
    public void updateBrand(Long brandId, Brand updatedBrand) {

    }

    @Override
    public void deleteBrand(Long brandId) {

    }
}
