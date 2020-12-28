package com.company.bucket3.web.screens.user;

import com.haulmont.cuba.gui.screen.*;
import com.company.bucket3.entity.User;

@UiController("bucket3_User.browse")
@UiDescriptor("user-browse.xml")
@LookupComponent("usersTable")
@LoadDataBeforeShow
public class UserBrowse extends StandardLookup<User> {
}