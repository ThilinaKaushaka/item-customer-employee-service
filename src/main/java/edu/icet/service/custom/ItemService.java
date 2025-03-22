package edu.icet.service.custom;

import edu.icet.model.dto.item.ItemDtoSave;
import edu.icet.service.SuperService;
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


public interface ItemService extends SuperService {
    void addItem(ItemDtoSave itemDtoSave);

    ItemCategory [] getItemCategory();

    ContactLensDuration [] getContactLensDuration();
    ContactLensMaterial [] getContactLensMaterial();
    ContactLensType [] getContactLensType();

    FrameGender [] getFrameGender();
    FrameMaterial [] getframeMaterial();
    FrameShape [] getFrameShape();

    LensCoating [] getLensCoating();
    LensMaterial [] getLensMaterial();
    LensType [] getLensType();
    LensFinished [] getLensFinished();

    NosePadMaterial [] getNosePadMaterial();

    SolutionType [] getSolutionType();

    CleanerType [] getCleanerType();

}
