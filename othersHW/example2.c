int main() {
    char grade = 'A';
    char newline = '\n';

    printf("Grade: %c%cNewline", grade, newline);

    if (grade == 'A') {
        printf("\nExcellent!\n");
    } else if (grade == 'B') {
        printf("\nGood!\n");
    } else {
        printf("\nWork harder!\n");
    }

    return 0;
}