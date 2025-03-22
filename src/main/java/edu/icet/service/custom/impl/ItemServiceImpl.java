package edu.icet.service.custom.impl;

import edu.icet.model.dto.item.ItemDtoSave;
import edu.icet.model.entity.item.ItemEntity;
import edu.icet.model.entity.item.contact_lens.ContactLensEntity;
import edu.icet.model.entity.item.contact_liquid.ContactLiquidEntity;
import edu.icet.model.entity.item.lens.LensEntity;
import edu.icet.model.entity.item.lens_cleaner.LensCleanerEntity;
import edu.icet.repository.custom.*;
import edu.icet.service.custom.ItemService;
import edu.icet.util.item.ItemCategory;
import edu.icet.util.item.contact_lens.ContactLensDuration;
import edu.icet.util.item.contact_lens.ContactLensMaterial;
import edu.icet.util.item.contact_lens.ContactLensType;
import edu.icet.util.item.contact_liquid.SolutionType;
import edu.icet.util.item.frame.FrameGender;
import edu.icet.util.item.frame.FrameMaterial;
import edu.icet.util.item.frame.FrameShape;
import edu.icet.util.item.lens.LensCoating;
import edu.icet.util.item.lens.LensFinished;
import edu.icet.util.item.lens.LensMaterial;
import edu.icet.util.item.lens.LensType;
import edu.icet.util.item.lens_cleaner.CleanerType;
import edu.icet.util.item.nose_pad.NosePadMaterial;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemDao itemDao;
    private final LensDao lensDao;
    private final ContactLensDao contactLensDao;
    private final ContactLiquidDao contactLiquidDao;
    private final LensCleanerDao lensCleanerDao;
    private final ModelMapper mapper;

    @Override
    public void addItem(ItemDtoSave itemDtoSave) {
        saveItem(ItemEntity.builder().id(itemDtoSave.getId()).name(itemDtoSave.getName()).category(itemDtoSave.getCategory()).brand(itemDtoSave.getBrand()).qty(itemDtoSave.getQty()).price(itemDtoSave.getPrice()).description(itemDtoSave.getDescription()).build());
        switch (itemDtoSave.getCategory()){
            case LENS: saveLens(itemDtoSave);return;
            case CONTACT_LENS: saveContactLens(itemDtoSave);return;
            case CONTACT_LIQUID: saveContactLiquid(itemDtoSave);return;
            case LENS_CLEANER: saveLensCleaner(itemDtoSave);return;

            case LENS_CLOTH:
                return;

            case BOX:
                return;

            case NAIL:
                return;

            case NOSE_PAD:
                return;
        }
    }

    private void saveItem(ItemEntity itemEntity){
        itemDao.save(itemEntity);
    }

    private void saveLens(ItemDtoSave itemDtoSave){
        LensEntity lens=mapper.map(itemDtoSave.getItemObject(), LensEntity.class);
        lens.setItemEntity(ItemEntity.builder().id(itemDao.findLastId()).build());
        lensDao.save(lens);
    }

    private void saveContactLens(ItemDtoSave itemDtoSave){
        ContactLensEntity contactLens=mapper.map(itemDtoSave.getItemObject(), ContactLensEntity.class);
        contactLens.setItemEntity(ItemEntity.builder().id(itemDao.findLastId()).build());
        contactLensDao.save(contactLens);
    }

    private void saveContactLiquid(ItemDtoSave itemDtoSave){
        ContactLiquidEntity contactLiquid=mapper.map(itemDtoSave.getItemObject(), ContactLiquidEntity.class);
        contactLiquid.setItemEntity(ItemEntity.builder().id(itemDao.findLastId()).build());
        contactLiquidDao.save(contactLiquid);
    }

    private void saveLensCleaner(ItemDtoSave itemDtoSave){
        LensCleanerEntity lensCleaner=mapper.map(itemDtoSave.getItemObject(), LensCleanerEntity.class);
        lensCleaner.setItemEntity(ItemEntity.builder().id(itemDao.findLastId()).build());
        lensCleanerDao.save(lensCleaner);
    }



    @Override
    public ItemCategory[] getItemCategory() {
        return ItemCategory.values();
    }

    @Override
    public ContactLensDuration[] getContactLensDuration() {
        return ContactLensDuration.values();
    }

    @Override
    public ContactLensMaterial[] getContactLensMaterial() {
        return ContactLensMaterial.values();
    }

    @Override
    public ContactLensType[] getContactLensType() {
        return ContactLensType.values();
    }



    @Override
    public FrameGender[] getFrameGender() {
        return FrameGender.values();
    }

    @Override
    public FrameMaterial[] getframeMaterial() {
        return FrameMaterial.values();
    }

    @Override
    public FrameShape[] getFrameShape() {
        return FrameShape.values();
    }



    @Override
    public LensCoating[] getLensCoating() {
        return LensCoating.values();
    }

    @Override
    public LensMaterial[] getLensMaterial() {
        return LensMaterial.values();
    }

    @Override
    public LensType[] getLensType() {
        return LensType.values();
    }

    @Override
    public LensFinished[] getLensFinished() {
        return LensFinished.values();
    }

    @Override
    public NosePadMaterial[] getNosePadMaterial() {
        return NosePadMaterial.values();
    }

    @Override
    public SolutionType[] getSolutionType() {
        return SolutionType.values();
    }

    @Override
    public CleanerType[] getCleanerType() {
        return CleanerType.values();
    }
}
