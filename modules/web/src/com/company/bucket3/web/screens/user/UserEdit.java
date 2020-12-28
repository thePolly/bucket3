package com.company.bucket3.web.screens.user;

import com.company.bucket3.entity.Bucket;
import com.haulmont.cuba.gui.screen.*;
import com.company.bucket3.entity.User;

import java.time.LocalDateTime;

@UiController("bucket3_User.edit")
@UiDescriptor("user-edit.xml")
@EditedEntityContainer("userDc")
@LoadDataBeforeShow
public class UserEdit extends StandardEditor<User> {


}