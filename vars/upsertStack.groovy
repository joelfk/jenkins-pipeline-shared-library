def call(String name = 'human') {
	def script = (libraryResource 'com/crownbet/upsertStack/upsertStack.sh').replace("{NAME}", "name")
	sh(script)
}