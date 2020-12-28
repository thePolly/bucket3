package com.company.bucket3.web.screens.bucket;

import com.company.bucket3.entity.User;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.screen.*;
import com.company.bucket3.entity.Bucket;

import javax.inject.Inject;
import java.time.LocalDateTime;

@UiController("bucket3_Bucket.edit")
@UiDescriptor("bucket-edit.xml")
@EditedEntityContainer("bucketDc")
@LoadDataBeforeShow
public class BucketEdit extends StandardEditor<Bucket> {
    @Subscribe
    public void onInitEntity(InitEntityEvent<Bucket> event)
    {
        event.getEntity().setDate(LocalDateTime.now());
    }

    @Inject
    private PickerField<User> userField;

}