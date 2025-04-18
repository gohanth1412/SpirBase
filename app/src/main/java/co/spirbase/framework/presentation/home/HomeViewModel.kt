package co.spirbase.framework.presentation.home

import co.spirbase.framework.model.TodoModel
import co.spirbase.framework.presentation.common.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : BaseViewModel() {
    val listTodoStateFlow = MutableStateFlow(
        listOf(
            TodoModel(id = 0, name = "Mua rau", des = "Day la mo ta ne", isSelected = true),
            TodoModel(id = 0, name = "Mua rau", des = "Day la mo ta ne", isSelected = false),
            TodoModel(id = 0, name = "Mua rau", des = "Day la mo ta ne", isSelected = false),
            TodoModel(id = 0, name = "Mua rau", des = "Day la mo ta ne", isSelected = false)
        )
    )

    fun addNewTodo(todo: TodoModel) {
        listTodoStateFlow.value = listTodoStateFlow.value.toMutableList().apply {
            add(todo)
        }
    }
}