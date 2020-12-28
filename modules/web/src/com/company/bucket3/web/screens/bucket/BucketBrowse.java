package com.company.bucket3.web.screens.bucket;

import com.haulmont.cuba.gui.screen.*;
import com.company.bucket3.entity.Bucket;

@UiController("bucket3_Bucket.browse")
@UiDescriptor("bucket-browse.xml")
@LookupComponent("bucketsTable")
@LoadDataBeforeShow
public class BucketBrowse extends StandardLookup<Bucket> {
}