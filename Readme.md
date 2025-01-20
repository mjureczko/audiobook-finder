
# Audiobook Finder

Audiobook Finder helps streamline the search for available audiobooks across popular platforms, making it easier to decide where a subscription may be most worthwhile.

## Overview

With a list of audiobooks you'd like to listen to, it can be time-consuming to check each platform individually for availability. 
Audiobook Finder automates this process by reading a `books.csv` file from the working directory, with each line listing a book title. 
The tool then checks the following platforms:
- Audible
- Audioteka
- Bookbeat
- Legimi
- O'Reilly
- Storytel

A report of the availability across these platforms is generated and saved to `search.csv` for easy reference.

I have not identified a well-defined Audioteka search API. 
Therefore, to avoid errors in Audioteka search results, you need to set the HASH constant in AudiotekaFinder.kt file. 
You can find the hash value by monitoring requests made to Audioteka in the network console of your browser. 
Look for the URL format: https://audioteka.com/_next/data/HASH/pl/szukaj... and the value under HASH is what you need.

Be aware that if your book list is very long, it may generate too many search requests, potentially leading some platforms to temporarily block your IP, which will cause errors in the search process. 
However, testing with 100 books completed without errors.

## Usage

1. Clone the project an open it in your favourite IDE.
2. Create a `books.csv` file with book titles, one per line in the project root directory.
3. Update audioteka hash (see above)
4. Run Audiobook Finder (execute `App.kt` from you IDE).
5. Open `search.csv` to view platform availability for each title.

## License

This project is licensed under the [GNU General Public License v3.0](https://www.gnu.org/licenses/gpl-3.0.en.html). You are free to use, modify, and distribute this software, as long as the same license terms are applied to any derivative works.

## Contributing

Feel free to submit pull requests or open issues. Contributions are welcome!
