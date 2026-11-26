package fr.estiam.helpdesklite.model

object TicketValidation {
    fun isTitleValid(title: String): Boolean {
        return title.isNotBlank()
    }

    fun isDescriptionValid(description: String): Boolean {
        return description.trim().length >= 10
    }

    fun create(
        id: String,
        title: String,
        description: String,
        priority: Priority,
        createdAt: Long,
    ): SupportTicket? {
        if (!isTitleValid(title) || !isDescriptionValid(description)) return null
        return SupportTicket(id, title.trim(), description.trim(), priority, Status.OPEN, createdAt)
    }
}
