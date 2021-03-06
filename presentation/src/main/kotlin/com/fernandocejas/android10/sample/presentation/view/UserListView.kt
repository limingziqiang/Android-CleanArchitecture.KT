/**
 * Copyright (C) 2014 android10.org. All rights reserved.
 * @author Fernando Cejas (the android10 coder)
 */
package com.fernandocejas.android10.sample.presentation.view

import com.fernandocejas.android10.sample.presentation.model.UserModel

/**
 * Interface representing a View in a model view presenter (MVP) pattern.
 * In this case is used as a view representing a list of [UserModel].
 */
interface UserListView : LoadDataView {
    /**
     * Render a user list in the UI.

     * @param userModelCollection The collection of [UserModel] that will be shown.
     */
    fun renderUserList(userModelCollection: Collection<UserModel>)

    /**
     * View a [UserModel] profile/details.

     * @param userModel The user that will be shown.
     */
    fun viewUser(userModel: UserModel)
}
