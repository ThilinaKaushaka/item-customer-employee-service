package edu.icet.controller;

import edu.icet.model.dto.item.ItemDtoSave;
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
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
@CrossOrigin
@RequiredArgsConstructor
public class ItemController {

    final ItemService itemService;

    @PostMapping("/add")
    void addItem(@RequestBody ItemDtoSave itemDtoSave){
        itemService.addItem(itemDtoSave);
    }





    @GetMapping("/get-item-category")
    ItemCategory[] getItemCategory(){
        return itemService.getItemCategory();
    }


    @GetMapping("/get-contact-lens-duration")
    ContactLensDuration [] getContactLensDuration(){
        return itemService.getContactLensDuration();
    }

    @GetMapping("/get-contact-lens-material")
    ContactLensMaterial [] getContactLensMaterial(){
        return itemService.getContactLensMaterial();
    }

    @GetMapping("/get-contact-lens-type")
    ContactLensType [] getContactLensType(){
        return itemService.getContactLensType();
    }



    @GetMapping("/get-frame-gender")
    FrameGender [] getFrameGender(){
        return itemService.getFrameGender();
    }

    @GetMapping("/get-frame-material")
    FrameMaterial [] getFrameMaterial(){
        return itemService.getframeMaterial();
    }

    @GetMapping("/get-frame-shape")
    FrameShape [] getFrameShape(){
        return itemService.getFrameShape();
    }



    @GetMapping("/get-lens-coating")
    LensCoating [] getLensCoating(){
        return itemService.getLensCoating();
    }

    @GetMapping("/get-lens-finished")
    LensFinished [] getLensFinished(){
        return itemService.getLensFinished();
    }

    @GetMapping("/get-lens-material")
    LensMaterial [] getLensMaterial(){
        return itemService.getLensMaterial();
    }

    @GetMapping("/get-lens-type")
    LensType [] getLensType(){
        return itemService.getLensType();
    }



    @GetMapping("/get-nose-pad-material")
    NosePadMaterial [] getNosePadMaterial(){
        return itemService.getNosePadMaterial();
    }

    @GetMapping("/get-solution-type")
    SolutionType[] getSolutionType(){
        return itemService.getSolutionType();
    }

    @GetMapping("/get-cleaner-type")
    CleanerType [] getLensCleanerType(){
        return itemService.getCleanerType();
    }

}
