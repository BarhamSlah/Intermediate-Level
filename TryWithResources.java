try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
    // Write your code and critical statements here
    int num = Integer.parseInt(br.readLine());
    System.out.println(num);
} catch (IOException e) {
    // Handle exceptions here
}

Why is this syntax so useful?

Any resource implementing AutoCloseable (like BufferedReader or Scanner) declared inside try(...) is automatically closed when the block finishes, eliminating the need for a manual finally block.
  
