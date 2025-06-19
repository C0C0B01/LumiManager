package dev.beefers.vendetta.manager.utils

import android.os.Environment
import dev.beefers.vendetta.manager.BuildConfig

object Constants {

    val TEAM_MEMBERS = listOf(
        TeamMember("Adv", "Artist", "aydeevee"),
        TeamMember("Demon", "Developer", "jSydorowicz21"),
        TeamMember("🍦Vanilla Milk🥛", "Donator - Made the first donation :)", "ChocolateMilk314"),
        TeamMember("Birb", "Donator", "ghost"),
        TeamMember("Chloe~♡", "Donator", "ChloeLovelocks"),
    )

    // NOTE: This is no longer used
    val VENDETTA_DIR = Environment.getExternalStorageDirectory().resolve("Bunny")

    val DUMMY_VERSION = DiscordVersion(1, 0, DiscordVersion.Type.STABLE)

    val START_TIME = System.currentTimeMillis()
}

object Intents {

    object Actions {
        const val INSTALL = "${BuildConfig.APPLICATION_ID}.intents.actions.INSTALL"
    }

    object Extras {
        const val VERSION = "${BuildConfig.APPLICATION_ID}.intents.extras.VERSION"
    }

}

object Channels {
    const val UPDATE = "${BuildConfig.APPLICATION_ID}.notifications.UPDATE"
}

data class TeamMember(
    val name: String,
    val role: String,
    val username: String = name
)

data class Donator(
    val name: String,
    val role: String,
    val username: String = name
)