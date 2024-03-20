
int main() {
    int i;

    // For Loop with continue and break
    printf("For Loop Output with continue and break:\n");
    for (i = 0; i < 5; i++) {
        if (i == 2) {
            printf("Iteration %d (skipped)\n", i);
            continue; // Skip this iteration and continue to the next
        }
        if (i == 4) {
            printf("Iteration %d (breaking loop)\n", i);
            break; // Break out of the loop
        }
        printf("Iteration %d\n", i);
    }

    // While Loop with continue and break
    printf("\nWhile Loop Output with continue and break:\n");
    i = 0; // Reset i
    while (i < 5) {
        if (i == 2) {
            printf("Iteration %d (skipped)\n", i);
            i++;
            continue; // Skip this iteration and continue to the next
        }
        if (i == 4) {
            printf("Iteration %d (breaking loop)\n", i);
            break; // Break out of the loop
        }
        printf("Iteration %d\n", i);
        i++;
    }

    return 0;
}