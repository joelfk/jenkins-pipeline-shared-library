def call(String name = 'human') {
	def script = libraryResource 'com/crownbet/upsertStack/upsertStack.sh'
	echo script
	writeFile file: 'upsertStack.sh', text: script
	sh 'upsertStack.sh'
}