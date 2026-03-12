package com.example.rickandmortycomposepractice.ui.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.rickandmortycomposepractice.ui.screens.CharacterDetailScreen
import com.example.rickandmortycomposepractice.ui.screens.CharacterListScreen

@Composable
fun NavigationHost(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
    navController = navController,
    startDestination = CharacterList,
    enterTransition = {
        slideIntoContainer(
            towards = AnimatedContentTransitionScope.SlideDirection.Left,
            animationSpec = tween(500)
        )
    },
    exitTransition = {
        slideOutOfContainer(
            towards = AnimatedContentTransitionScope.SlideDirection.Left,
            animationSpec = tween(500)
        )
    },
    popEnterTransition = {
        slideIntoContainer(
            towards = AnimatedContentTransitionScope.SlideDirection.Right,
            animationSpec = tween(500)
        )
    },
    popExitTransition = {
        slideOutOfContainer(
            towards = AnimatedContentTransitionScope.SlideDirection.Right,
            animationSpec = tween(500)
        )
    }
    ) {
        composable<CharacterList> {
            CharacterListScreen(
                onCharacterClick = { _ ->
                    navController.navigate(CharacterDetail(id))
                }
            )
        }

        composable<CharacterDetail> { navBackStackEntry ->
            val params = navBackStackEntry.toRoute<CharacterDetail>()
            CharacterDetailScreen(
                characterId = params.id,
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}