def call(String name = 'human') {
	def script = libraryResource 'com/crownbet/upsertStack/upsertStack.sh'
	sh script
}